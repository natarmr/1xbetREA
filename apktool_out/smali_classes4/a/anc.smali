.class public final synthetic La/anc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gnc;


# direct methods
.method public synthetic constructor <init>(La/gnc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/anc;->a:B

    iput-object p1, p0, La/anc;->b:La/gnc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/anc;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    iget-object p0, p0, La/anc;->b:La/gnc;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/gnc;->Z1:La/kl5;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    if-lt p2, v1, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/uq6;->l(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p2, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    if-nez p1, :cond_1

    .line 31
    .line 32
    sget-object p1, La/iun;->a:La/iun;

    .line 33
    .line 34
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-nez p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, La/gnc;->P0()La/k3t0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p2, La/yf2;

    .line 45
    .line 46
    invoke-direct {p2, p1}, La/yf2;-><init>(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_0
    sget-object p1, La/gnc;->Z1:La/kl5;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/gnc;->M0()La/k3t0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object p1, La/pmc;->a:La/pmc;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    sget-object v0, La/gnc;->Z1:La/kl5;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    if-lt p2, v1, :cond_3

    .line 76
    .line 77
    invoke-static {p1}, La/uq6;->t(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const-string p2, "REQUEST_KEY_OTHER_CLEAR"

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_1
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    const/4 p1, 0x0

    .line 96
    :goto_2
    if-nez p1, :cond_5

    .line 97
    .line 98
    sget-object p1, La/iun;->a:La/iun;

    .line 99
    .line 100
    :cond_5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0}, La/gnc;->O0()La/k3t0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    new-instance p2, La/vb80;

    .line 111
    .line 112
    invoke-direct {p2, p1}, La/vb80;-><init>(Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
