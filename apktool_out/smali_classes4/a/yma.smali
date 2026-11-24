.class public final synthetic La/yma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yma;->a:B

    iput-object p1, p0, La/yma;->b:Landroid/view/Window;

    iput-boolean p2, p0, La/yma;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/yma;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/16 v2, 0x1e

    .line 6
    .line 7
    const/16 v3, 0x23

    .line 8
    .line 9
    iget-boolean v4, p0, La/yma;->c:Z

    .line 10
    .line 11
    iget-object v5, p0, La/yma;->b:Landroid/view/Window;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, La/ani0;

    .line 25
    .line 26
    invoke-direct {v0, p0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    if-lt p0, v3, :cond_0

    .line 32
    .line 33
    new-instance p0, La/bjv0;

    .line 34
    .line 35
    invoke-direct {p0, v5, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-lt p0, v2, :cond_1

    .line 40
    .line 41
    new-instance p0, La/ajv0;

    .line 42
    .line 43
    invoke-direct {p0, v5, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-lt p0, v1, :cond_2

    .line 48
    .line 49
    new-instance p0, La/ziv0;

    .line 50
    .line 51
    invoke-direct {p0, v5, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance p0, La/yiv0;

    .line 56
    .line 57
    invoke-direct {p0, v5, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    xor-int/lit8 v0, v4, 0x1

    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/ycm0;->w(Z)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v0, La/ani0;

    .line 76
    .line 77
    invoke-direct {v0, p0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    if-lt p0, v3, :cond_3

    .line 83
    .line 84
    new-instance p0, La/bjv0;

    .line 85
    .line 86
    invoke-direct {p0, v5, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    if-lt p0, v2, :cond_4

    .line 91
    .line 92
    new-instance p0, La/ajv0;

    .line 93
    .line 94
    invoke-direct {p0, v5, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-lt p0, v1, :cond_5

    .line 99
    .line 100
    new-instance p0, La/ziv0;

    .line 101
    .line 102
    invoke-direct {p0, v5, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    new-instance p0, La/yiv0;

    .line 107
    .line 108
    invoke-direct {p0, v5, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    xor-int/lit8 v0, v4, 0x1

    .line 112
    .line 113
    invoke-virtual {p0, v0}, La/ycm0;->w(Z)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_1
    iget-object v0, p0, La/yma;->b:Landroid/view/Window;

    .line 120
    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const v3, 0x7f040ae3

    .line 140
    .line 141
    .line 142
    invoke-static {v2, v3, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    const/4 v4, 0x0

    .line 147
    const v2, 0x7f0606d8

    .line 148
    .line 149
    .line 150
    iget-boolean v5, p0, La/yma;->c:Z

    .line 151
    .line 152
    invoke-static/range {v0 .. v5}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 153
    .line 154
    .line 155
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
