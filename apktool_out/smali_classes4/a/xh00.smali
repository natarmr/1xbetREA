.class public final synthetic La/xh00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cyu;


# direct methods
.method public synthetic constructor <init>(La/cyu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xh00;->a:B

    iput-object p1, p0, La/xh00;->b:La/cyu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/xh00;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xh00;->b:La/cyu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/cyu;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/xoq;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, La/xoq;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, v1}, La/xoq;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/cyu;->c:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, La/cyu;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/hy40;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/wh00;->f(La/ee60;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, La/cyu;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/xoq;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, La/cyu;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/hy40;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/wh00;->j(La/ee60;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
