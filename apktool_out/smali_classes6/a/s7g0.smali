.class public final La/s7g0;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/jk3;

.field public final v:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/jk3;La/dvd0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 5
    .line 6
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/s7g0;->u:La/jk3;

    .line 15
    .line 16
    iput-object p2, p0, La/s7g0;->v:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final t()V
    .locals 1

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object p0, p0, La/s7g0;->u:La/jk3;

    .line 4
    .line 5
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 8
    .line 9
    invoke-static {p0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
