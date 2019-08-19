package net.gobbob.mobends.core.client.gui.customize.store;

import net.gobbob.mobends.core.animatedentity.AnimatedEntity;
import net.gobbob.mobends.core.client.gui.customize.IEditorAction;
import net.gobbob.mobends.core.client.gui.customize.viewport.AlterEntryRig;
import net.gobbob.mobends.core.store.Observable;

import java.util.ArrayList;
import java.util.List;

public class CustomizeState
{

    public final Observable<AnimatedEntity<?>> currentAnimatedEntity = new Observable<>();
    public final Observable<AlterEntryRig> rig = new Observable<>();
    public final Observable<AlterEntryRig.Bone> selectedPart = new Observable<>();

    public final List<IEditorAction> actionHistory = new ArrayList<>();
    public int actionHistoryPointer = 0;
    public boolean changesMade = false;

}
