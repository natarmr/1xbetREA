.class public final La/yg2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hh2;


# direct methods
.method public synthetic constructor <init>(La/hh2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yg2;->a:B

    iput-object p1, p0, La/yg2;->b:La/hh2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yg2;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/yg2;->b:La/hh2;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v5, p1

    .line 11
    .line 12
    check-cast v5, La/hat;

    .line 13
    .line 14
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/ug2;

    .line 19
    .line 20
    iget-object v1, v1, La/ug2;->c:La/hat;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    xor-int/lit8 v6, v1, 0x1

    .line 35
    .line 36
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 37
    .line 38
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v15

    .line 44
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 48
    .line 49
    move-object v3, v2

    .line 50
    move-object v2, v15

    .line 51
    check-cast v2, La/ug2;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    const/16 v14, 0x7e3

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    invoke-static/range {v2 .. v14}, La/ug2;->a(La/ug2;La/hg2;ZLa/hat;ZZZZLjava/util/Set;Ljava/util/List;Ljava/lang/String;ZI)La/ug2;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v1, v15, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, La/k2g0;

    .line 83
    .line 84
    iget-object v2, v0, La/hh2;->o:La/vzg0;

    .line 85
    .line 86
    const-string v3, "EXPANDED_IDS_KEY"

    .line 87
    .line 88
    iget-object v4, v1, La/k2g0;->d:Ljava/util/Set;

    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 94
    .line 95
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 105
    .line 106
    move-object v5, v3

    .line 107
    check-cast v5, La/ug2;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v13, v1, La/k2g0;->d:Ljava/util/Set;

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x77f

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x0

    .line 121
    const/4 v9, 0x0

    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v11, 0x0

    .line 124
    const/4 v12, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    invoke-static/range {v5 .. v17}, La/ug2;->a(La/ug2;La/hg2;ZLa/hat;ZZZZLjava/util/Set;Ljava/util/List;Ljava/lang/String;ZI)La/ug2;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_1

    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
