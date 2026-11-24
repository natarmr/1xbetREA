.class public final synthetic La/q4p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/favorites/impl/presentation/category/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/a;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q4p;->a:B

    iput-object p1, p0, La/q4p;->b:Lorg/xplatform/favorites/impl/presentation/category/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q4p;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/q4p;->b:Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    check-cast v4, La/x4p;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v8, La/f4p;->b:La/f4p;

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x3ef7

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    invoke-static/range {v4 .. v18}, La/x4p;->a(La/x4p;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;Ljava/util/List;ZZZZLa/v5l0;ZZI)La/x4p;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Throwable;

    .line 77
    .line 78
    move-object/from16 v2, p2

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 89
    .line 90
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 91
    .line 92
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 100
    .line 101
    move-object v4, v2

    .line 102
    check-cast v4, La/x4p;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget-object v8, La/f4p;->b:La/f4p;

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const/16 v18, 0x3ef7

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v14, 0x0

    .line 122
    const/4 v15, 0x0

    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    invoke-static/range {v4 .. v18}, La/x4p;->a(La/x4p;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;Ljava/util/List;ZZZZLa/v5l0;ZZI)La/x4p;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_1

    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
