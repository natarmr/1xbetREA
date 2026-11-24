.class public final La/j4q0;
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
    iput-object p1, p0, La/j4q0;->u:La/bdu0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final t()V
    .locals 2

    .line 1
    iget-object p0, p0, La/j4q0;->u:La/bdu0;

    .line 2
    .line 3
    iget-object v0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object p0, p0, La/bdu0;->b:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const v1, 0x7f130792

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
