.class public final La/z9i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z9i;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 20

    .line 1
    new-instance v0, La/uf7;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/z9i;->a:La/n8i;

    .line 6
    .line 7
    iget-object v1, v1, La/n8i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/o3c;

    .line 10
    .line 11
    iget-object v2, v1, La/o3c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 14
    .line 15
    new-instance v3, La/xfu;

    .line 16
    .line 17
    new-instance v4, La/ciu;

    .line 18
    .line 19
    new-instance v5, La/pzu;

    .line 20
    .line 21
    new-instance v6, La/abu;

    .line 22
    .line 23
    iget-object v7, v1, La/o3c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v7, La/gii0;

    .line 26
    .line 27
    const/16 v12, 0x19

    .line 28
    .line 29
    invoke-direct {v6, v7, v12}, La/abu;-><init>(La/gii0;B)V

    .line 30
    .line 31
    .line 32
    iget-object v7, v1, La/o3c;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, La/dzz;

    .line 35
    .line 36
    iget-object v8, v1, La/o3c;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, La/xio;

    .line 39
    .line 40
    iget-object v9, v1, La/o3c;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v9, La/czz;

    .line 43
    .line 44
    iget-object v10, v1, La/o3c;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, La/btt0;

    .line 47
    .line 48
    iget-object v11, v1, La/o3c;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v11, La/knf0;

    .line 51
    .line 52
    invoke-direct/range {v5 .. v11}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 53
    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-direct {v4, v5, v6}, La/ciu;-><init>(La/pzu;B)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v4}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v4, v1, La/o3c;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, La/wsf0;

    .line 65
    .line 66
    iget-object v5, v4, La/wsf0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, La/g45;

    .line 69
    .line 70
    invoke-virtual {v5}, La/g45;->E()La/nou;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iget-object v4, v4, La/wsf0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, La/g45;

    .line 77
    .line 78
    invoke-virtual {v4}, La/g45;->t()La/m0u;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-instance v6, La/f5a;

    .line 83
    .line 84
    new-instance v13, La/pzu;

    .line 85
    .line 86
    new-instance v14, La/abu;

    .line 87
    .line 88
    iget-object v7, v1, La/o3c;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, La/gii0;

    .line 91
    .line 92
    invoke-direct {v14, v7, v12}, La/abu;-><init>(La/gii0;B)V

    .line 93
    .line 94
    .line 95
    iget-object v7, v1, La/o3c;->c:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v7

    .line 98
    check-cast v15, La/dzz;

    .line 99
    .line 100
    iget-object v7, v1, La/o3c;->d:Ljava/lang/Object;

    .line 101
    .line 102
    move-object/from16 v16, v7

    .line 103
    .line 104
    check-cast v16, La/xio;

    .line 105
    .line 106
    iget-object v7, v1, La/o3c;->e:Ljava/lang/Object;

    .line 107
    .line 108
    move-object/from16 v17, v7

    .line 109
    .line 110
    check-cast v17, La/czz;

    .line 111
    .line 112
    iget-object v7, v1, La/o3c;->f:Ljava/lang/Object;

    .line 113
    .line 114
    move-object/from16 v18, v7

    .line 115
    .line 116
    check-cast v18, La/btt0;

    .line 117
    .line 118
    iget-object v7, v1, La/o3c;->g:Ljava/lang/Object;

    .line 119
    .line 120
    move-object/from16 v19, v7

    .line 121
    .line 122
    check-cast v19, La/knf0;

    .line 123
    .line 124
    invoke-direct/range {v13 .. v19}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v6, v13}, La/f5a;-><init>(La/pzu;)V

    .line 128
    .line 129
    .line 130
    iget-object v7, v1, La/o3c;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v7, La/i1w0;

    .line 133
    .line 134
    iget-object v1, v1, La/o3c;->j:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v8, v1

    .line 137
    check-cast v8, La/duj;

    .line 138
    .line 139
    move-object v1, v5

    .line 140
    move-object v5, v4

    .line 141
    move-object v4, v1

    .line 142
    move-object/from16 v1, p1

    .line 143
    .line 144
    invoke-direct/range {v0 .. v8}, La/uf7;-><init>(La/vzg0;Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;La/xfu;La/nou;La/m0u;La/f5a;La/i1w0;La/duj;)V

    .line 145
    .line 146
    .line 147
    return-object v0
.end method
