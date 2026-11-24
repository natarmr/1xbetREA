.class public final synthetic La/omh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qmh0;


# direct methods
.method public synthetic constructor <init>(La/qmh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/omh0;->a:B

    iput-object p1, p0, La/omh0;->b:La/qmh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/omh0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/omh0;->b:La/qmh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 9
    .line 10
    iget-object v1, p0, La/i3t0;->i:La/ocj;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of p1, p1, La/uun;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, v1, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v1, p0

    .line 31
    check-cast v1, La/mmh0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, La/ilh0;

    .line 37
    .line 38
    sget-object v3, La/z1o;->a:La/z1o;

    .line 39
    .line 40
    invoke-direct {v2, v3}, La/ilh0;-><init>(La/z1o;)V

    .line 41
    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    const/16 v11, 0x1fe

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    invoke-static/range {v1 .. v11}, La/mmh0;->a(La/mmh0;La/llh0;Ljava/util/List;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/amh0;I)La/mmh0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/mmh0;

    .line 69
    .line 70
    iget-object p0, p0, La/mmh0;->b:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    iget-object p0, v1, La/ocj;->a:La/p7m0;

    .line 79
    .line 80
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-object v1, p1

    .line 88
    check-cast v1, La/mmh0;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v2, La/ilh0;

    .line 94
    .line 95
    sget-object v3, La/z1o;->b:La/z1o;

    .line 96
    .line 97
    invoke-direct {v2, v3}, La/ilh0;-><init>(La/z1o;)V

    .line 98
    .line 99
    .line 100
    const/4 v10, 0x0

    .line 101
    const/16 v11, 0x1fe

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x0

    .line 109
    const/4 v9, 0x0

    .line 110
    invoke-static/range {v1 .. v11}, La/mmh0;->a(La/mmh0;La/llh0;Ljava/util/List;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/amh0;I)La/mmh0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, La/qmh0;->w:La/duj;

    .line 129
    .line 130
    new-instance v1, La/dke0;

    .line 131
    .line 132
    const/16 v2, 0x1c

    .line 133
    .line 134
    invoke-direct {v1, p0, v2}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
