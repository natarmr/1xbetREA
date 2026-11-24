.class public final La/a630;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/by5;


# direct methods
.method public synthetic constructor <init>(La/by5;La/kxq;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/a630;->a:B

    iput-object p1, p0, La/a630;->b:La/by5;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/a630;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/a630;->b:La/by5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/wgk0;

    .line 9
    .line 10
    sget-object v0, La/wgk0;->d2:[La/iiy;

    .line 11
    .line 12
    invoke-virtual {p0}, La/wgk0;->S0()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, La/i630;

    .line 17
    .line 18
    sget-object v0, La/i630;->k2:La/evz;

    .line 19
    .line 20
    invoke-virtual {p0}, La/i630;->T0()La/f730;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, La/f730;->w()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p0, La/b630;

    .line 29
    .line 30
    sget-object v0, La/b630;->m2:La/htz;

    .line 31
    .line 32
    invoke-virtual {p0}, La/b630;->T0()La/e730;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, La/e730;->w()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
