.class public final synthetic La/l450;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o450;


# direct methods
.method public synthetic constructor <init>(La/o450;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l450;->a:B

    iput-object p1, p0, La/l450;->b:La/o450;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/l450;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l450;->b:La/o450;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/o450;->V1:La/atz;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/o450;->G0()La/d650;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/b450;->a:La/b450;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/d650;->X(La/j450;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object p1, La/o450;->V1:La/atz;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/o450;->G0()La/d650;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, La/h350;->a:La/h350;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/d650;->X(La/j450;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
