.class public final synthetic La/rw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uw8;


# direct methods
.method public synthetic constructor <init>(La/uw8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rw8;->a:B

    iput-object p1, p0, La/rw8;->b:La/uw8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/rw8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rw8;->b:La/uw8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/uw8;->S1:La/cl5;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/uw8;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/gu8;->a:La/gu8;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object v0, La/uw8;->S1:La/cl5;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string p2, "PRESSED_INFO_BACK_BUTTON_KEY"

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, La/uw8;->G0()La/k3t0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, La/bu8;->a:La/bu8;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
