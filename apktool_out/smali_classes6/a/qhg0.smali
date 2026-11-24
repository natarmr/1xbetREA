.class public final La/qhg0;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/bdu0;


# direct methods
.method public constructor <init>(La/bdu0;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/bdu0;->b:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/qhg0;->u:La/bdu0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final t()V
    .locals 1

    .line 1
    iget-object p0, p0, La/qhg0;->u:La/bdu0;

    .line 2
    .line 3
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
