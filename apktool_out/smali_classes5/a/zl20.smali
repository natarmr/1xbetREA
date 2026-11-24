.class public final synthetic La/zl20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cit0;


# direct methods
.method public synthetic constructor <init>(La/cit0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zl20;->a:B

    iput-object p1, p0, La/zl20;->b:La/cit0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zl20;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/zl20;->b:La/cit0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v5, p2

    .line 19
    .line 20
    check-cast v5, La/a820;

    .line 21
    .line 22
    iget-object v6, v5, La/a820;->f:La/dzc0;

    .line 23
    .line 24
    iget-object v1, v6, La/dzc0;->a:La/syc0;

    .line 25
    .line 26
    iget-object v0, v0, La/cit0;->O:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    xor-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    invoke-static {v1, v4, v3, v0, v2}, La/syc0;->a(La/syc0;La/pz40;ZZI)La/syc0;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const/4 v11, 0x0

    .line 39
    const/16 v12, 0x3e

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    invoke-static/range {v6 .. v12}, La/dzc0;->a(La/dzc0;La/syc0;La/olc0;ZZZI)La/dzc0;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    const/16 v21, 0x0

    .line 49
    .line 50
    const v22, 0x3ffdf

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    invoke-static/range {v5 .. v22}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_0
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, La/oyg0;

    .line 79
    .line 80
    move-object/from16 v5, p2

    .line 81
    .line 82
    check-cast v5, La/b820;

    .line 83
    .line 84
    iget-object v6, v5, La/b820;->e:La/czc0;

    .line 85
    .line 86
    if-eqz v6, :cond_0

    .line 87
    .line 88
    iget-object v1, v6, La/czc0;->a:La/tyc0;

    .line 89
    .line 90
    iget-object v0, v0, La/cit0;->O:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    xor-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    invoke-static {v1, v4, v3, v0, v2}, La/tyc0;->a(La/tyc0;La/pz40;ZZI)La/tyc0;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    const/4 v10, 0x0

    .line 103
    const/16 v11, 0x1e

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    invoke-static/range {v6 .. v11}, La/czc0;->a(La/czc0;La/tyc0;La/qlc0;ZZI)La/czc0;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    :cond_0
    move-object v10, v4

    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/16 v18, 0x1fef

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    invoke-static/range {v5 .. v18}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
