.class public final synthetic La/p59;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/yx5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p59;->a:B

    iput-object p1, p0, La/p59;->b:La/yx5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSystemUiVisibilityChange(I)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/p59;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, La/p59;->b:La/yx5;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/j79;

    .line 10
    .line 11
    sget-object p1, La/j79;->O1:La/kl5;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, v0}, La/jar0;->V(La/kxq;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, La/r59;

    .line 22
    .line 23
    sget-object p1, La/r59;->P1:La/cl5;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, v0}, La/jar0;->V(La/kxq;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
