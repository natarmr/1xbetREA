.class public final synthetic La/b2f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d2f;


# direct methods
.method public synthetic constructor <init>(La/d2f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b2f;->a:B

    iput-object p1, p0, La/b2f;->b:La/d2f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/b2f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/b2f;->b:La/d2f;

    .line 4
    .line 5
    iget-object p0, p0, La/d2f;->L1:La/a8z;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    check-cast p2, Landroid/os/Bundle;

    .line 13
    .line 14
    sget-object v0, La/d2f;->O1:La/std;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string p1, "BARCODE_SCANNER_BUNDLE_KEY"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, La/k3t0;

    .line 41
    .line 42
    new-instance v0, La/v1f;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/v1f;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/k3t0;

    .line 55
    .line 56
    sget-object p1, La/r1f;->a:La/r1f;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    check-cast p1, La/fet;

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    sget-object v0, La/d2f;->O1:La/std;

    .line 73
    .line 74
    and-int/lit8 v0, p2, 0x3

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v3, 0x1

    .line 79
    if-eq v0, v1, :cond_1

    .line 80
    .line 81
    move v0, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v0, v2

    .line 84
    :goto_0
    and-int/2addr p2, v3

    .line 85
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, La/k3t0;

    .line 96
    .line 97
    check-cast p2, La/i3t0;

    .line 98
    .line 99
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, La/p2f;

    .line 108
    .line 109
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    move-object v5, p0

    .line 114
    check-cast v5, La/k3t0;

    .line 115
    .line 116
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez p0, :cond_2

    .line 125
    .line 126
    sget-object p0, La/ukd;->a:La/cl5;

    .line 127
    .line 128
    if-ne v0, p0, :cond_3

    .line 129
    .line 130
    :cond_2
    new-instance v3, La/z6e;

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    const/16 v10, 0x19

    .line 134
    .line 135
    const/4 v4, 0x1

    .line 136
    const-class v6, La/k3t0;

    .line 137
    .line 138
    const-string v7, "onAction"

    .line 139
    .line 140
    const-string v8, "onAction(Ljava/lang/Object;)V"

    .line 141
    .line 142
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v0, v3

    .line 149
    :cond_3
    check-cast v0, La/jhy;

    .line 150
    .line 151
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 152
    .line 153
    const/4 p0, 0x0

    .line 154
    invoke-static {p0, p2, v0, p1, v2}, La/p8a;->n(La/mm40;La/p2f;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 159
    .line 160
    .line 161
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
