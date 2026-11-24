.class public final La/f5d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dlz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ilz;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/f5d;->a:B

    iput-object p2, p0, La/f5d;->b:Ljava/lang/Object;

    iput-object p3, p0, La/f5d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/f5d;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/f5d;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/f5d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    .line 11
    .line 12
    check-cast v1, La/ma3;

    .line 13
    .line 14
    invoke-static {p0, v1}, La/r6e;->u(Landroid/window/OnBackInvokedDispatcher;La/ma3;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Landroid/view/Window;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    check-cast v1, La/e5d;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
