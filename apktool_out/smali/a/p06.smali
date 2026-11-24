.class public final La/p06;
.super La/dj10;
.source "SourceFile"


# instance fields
.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p06;->g:B

    invoke-direct {p0, p1}, La/dj10;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/p06;->g:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/dj10;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    check-cast p2, La/xpg0;

    .line 13
    .line 14
    check-cast p3, La/xpg0;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of p0, p2, La/o06;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "Check failed."

    .line 28
    .line 29
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
