.class public final La/tq00;
.super La/ewo;
.source "SourceFile"


# instance fields
.field public final synthetic l1:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;


# direct methods
.method public constructor <init>(Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tq00;->l1:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 2
    .line 3
    invoke-direct {p0}, La/muu0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o(Landroid/view/ViewGroup;La/mns0;La/mns0;)Landroid/animation/Animator;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, La/muu0;->o(Landroid/view/ViewGroup;La/mns0;La/mns0;)Landroid/animation/Animator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p2, La/r9g;

    .line 8
    .line 9
    const/4 p3, 0x7

    .line 10
    iget-object p0, p0, La/tq00;->l1:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 11
    .line 12
    invoke-direct {p2, p0, p3}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p1
.end method
