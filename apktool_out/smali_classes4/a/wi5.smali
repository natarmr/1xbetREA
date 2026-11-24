.class public final synthetic La/wi5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/p2k0;

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/p2k0;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wi5;->a:La/p2k0;

    iput p2, p0, La/wi5;->b:I

    iput-object p3, p0, La/wi5;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/wi5;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, La/wi5;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/wi5;->f:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/ir8;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, La/fet;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    if-eq p3, v0, :cond_2

    .line 36
    .line 37
    move p3, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move p3, v8

    .line 40
    :goto_1
    and-int/2addr p2, v1

    .line 41
    invoke-virtual {v4, p2, p3}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_6

    .line 46
    .line 47
    iget-object p2, p0, La/wi5;->a:La/p2k0;

    .line 48
    .line 49
    instance-of p3, p2, La/m2k0;

    .line 50
    .line 51
    if-eqz p3, :cond_3

    .line 52
    .line 53
    const p1, -0x7d9ceef7

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p1}, La/fet;->e0(I)V

    .line 57
    .line 58
    .line 59
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 60
    .line 61
    move-object v1, p2

    .line 62
    check-cast v1, La/m2k0;

    .line 63
    .line 64
    const/4 v7, 0x6

    .line 65
    iget v2, p0, La/wi5;->b:I

    .line 66
    .line 67
    iget-object v3, p0, La/wi5;->c:Lkotlin/jvm/functions/Function1;

    .line 68
    .line 69
    move-object v6, v4

    .line 70
    iget-object v4, p0, La/wi5;->d:Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    iget-object v5, p0, La/wi5;->e:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    invoke-static/range {v0 .. v7}, La/fre0;->F(La/mm40;La/m2k0;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move-object v6, v4

    .line 82
    instance-of p3, p2, La/n2k0;

    .line 83
    .line 84
    if-eqz p3, :cond_4

    .line 85
    .line 86
    const p3, 0x3e036b5c

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, p3}, La/fet;->e0(I)V

    .line 90
    .line 91
    .line 92
    sget-object p3, La/jm40;->b:La/jm40;

    .line 93
    .line 94
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 95
    .line 96
    invoke-interface {p1, p3, v0}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast p2, La/n2k0;

    .line 101
    .line 102
    iget-object v1, p2, La/n2k0;->a:La/mdm;

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    move-object v4, v6

    .line 106
    const/4 v6, 0x4

    .line 107
    const/4 v2, 0x0

    .line 108
    iget-object v3, p0, La/wi5;->f:Lkotlin/jvm/functions/Function0;

    .line 109
    .line 110
    invoke-static/range {v0 .. v6}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 111
    .line 112
    .line 113
    move-object v6, v4

    .line 114
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    sget-object p0, La/o2k0;->a:La/o2k0;

    .line 119
    .line 120
    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_5

    .line 125
    .line 126
    const p0, 0x3e038d00

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 130
    .line 131
    .line 132
    const/4 p0, 0x0

    .line 133
    invoke-static {v8, v6, p0}, La/fre0;->G(ILa/fet;La/mm40;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    const p0, 0x3e03280c

    .line 141
    .line 142
    .line 143
    invoke-static {p0, v6, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    throw p0

    .line 148
    :cond_6
    move-object v6, v4

    .line 149
    invoke-virtual {v6}, La/fet;->X()V

    .line 150
    .line 151
    .line 152
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0
.end method
