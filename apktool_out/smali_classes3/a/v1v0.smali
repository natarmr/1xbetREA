.class public final La/v1v0;
.super La/hgd;
.source "SourceFile"


# instance fields
.field public final synthetic e:B

.field public final synthetic f:La/by5;


# direct methods
.method public synthetic constructor <init>(La/by5;Landroid/content/Context;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/v1v0;->e:B

    iput-object p1, p0, La/v1v0;->f:La/by5;

    invoke-direct {p0, p2, p3}, La/hgd;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/v1v0;->e:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/v1v0;->f:La/by5;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, La/a2v0;

    .line 10
    .line 11
    sget-object v0, La/a2v0;->g2:La/svs0;

    .line 12
    .line 13
    invoke-virtual {v2}, La/a2v0;->S0()La/c2v0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/c2v0;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3, v2, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1, v1, v1}, La/sik;->z0(ZZZ)V

    .line 27
    .line 28
    .line 29
    invoke-super {p0}, La/hgd;->onBackPressed()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    check-cast v2, La/w1v0;

    .line 34
    .line 35
    sget-object v0, La/w1v0;->j2:La/bzs0;

    .line 36
    .line 37
    invoke-virtual {v2}, La/w1v0;->S0()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v2, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1, v1, v1}, La/sik;->z0(ZZZ)V

    .line 49
    .line 50
    .line 51
    invoke-super {p0}, La/hgd;->onBackPressed()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
