.class public final synthetic La/sa7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wa7;


# direct methods
.method public synthetic constructor <init>(La/wa7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sa7;->a:B

    iput-object p1, p0, La/sa7;->b:La/wa7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/sa7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sa7;->b:La/wa7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "REQUEST_MENU_ITEM_KEY"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p2, "HISTORY_MENU_ITEM_RESULT"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v1, 0x21

    .line 33
    .line 34
    if-gt v0, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p1}, La/uq6;->C(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/os/Parcelable;

    .line 46
    .line 47
    :goto_0
    check-cast p1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p2, La/y97;

    .line 57
    .line 58
    invoke-direct {p2, p1}, La/y97;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    return-void

    .line 65
    :pswitch_0
    sget-object v0, La/wa7;->U1:La/kj5;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v0, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-nez p2, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    const-string p2, "BET_SALE_CONFIRM_REQUEST"

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, La/wa7;->I0()La/k3t0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object p1, La/ha7;->a:La/ha7;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_2
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
