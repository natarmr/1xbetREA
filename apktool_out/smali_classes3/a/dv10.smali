.class public final synthetic La/dv10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hv10;


# direct methods
.method public synthetic constructor <init>(La/hv10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dv10;->a:B

    iput-object p1, p0, La/dv10;->b:La/hv10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/dv10;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dv10;->b:La/hv10;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/hv10;->X1:La/atz;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string p1, "USER_AGREEMENT_DIALOG_REQUEST_KEY"

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/hv10;->I0()La/w220;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, La/w220;->B()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    sget-object p1, La/hv10;->X1:La/atz;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/hv10;->G0()La/sao0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const p2, 0x7f0a0388

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    new-instance p2, La/tvj;

    .line 58
    .line 59
    new-instance v0, La/ev10;

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-direct {v0, p0, v1}, La/ev10;-><init>(La/hv10;B)V

    .line 63
    .line 64
    .line 65
    const/16 p0, 0x3b

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {p2, v0, v1, v1, p0}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, La/glz;->a(La/blz;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
