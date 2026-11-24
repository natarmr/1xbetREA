.class public final La/hfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 21

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, La/i1w0;

    .line 4
    .line 5
    new-instance v0, La/p9k;

    .line 6
    .line 7
    new-instance v2, La/tqt;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p0

    .line 13
    .line 14
    iget-object v3, v3, La/hfi;->a:La/yei;

    .line 15
    .line 16
    iget-object v3, v3, La/yei;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/o3c;

    .line 19
    .line 20
    new-instance v4, La/yfu;

    .line 21
    .line 22
    new-instance v5, La/pzu;

    .line 23
    .line 24
    new-instance v6, La/abu;

    .line 25
    .line 26
    iget-object v7, v3, La/o3c;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, La/gii0;

    .line 29
    .line 30
    const/16 v12, 0x19

    .line 31
    .line 32
    invoke-direct {v6, v7, v12}, La/abu;-><init>(La/gii0;B)V

    .line 33
    .line 34
    .line 35
    iget-object v7, v3, La/o3c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/dzz;

    .line 38
    .line 39
    iget-object v8, v3, La/o3c;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, La/xio;

    .line 42
    .line 43
    iget-object v9, v3, La/o3c;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v9, La/czz;

    .line 46
    .line 47
    iget-object v10, v3, La/o3c;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, La/btt0;

    .line 50
    .line 51
    iget-object v11, v3, La/o3c;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v11, La/knf0;

    .line 54
    .line 55
    invoke-direct/range {v5 .. v11}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v5}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v5, v3, La/o3c;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, La/wsf0;

    .line 64
    .line 65
    iget-object v6, v5, La/wsf0;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, La/g45;

    .line 68
    .line 69
    invoke-virtual {v6}, La/g45;->E()La/nou;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    iget-object v5, v5, La/wsf0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, La/g45;

    .line 76
    .line 77
    invoke-virtual {v5}, La/g45;->t()La/m0u;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v7, v4

    .line 82
    move-object v4, v6

    .line 83
    new-instance v6, La/f5a;

    .line 84
    .line 85
    new-instance v13, La/pzu;

    .line 86
    .line 87
    new-instance v14, La/abu;

    .line 88
    .line 89
    iget-object v8, v3, La/o3c;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v8, La/gii0;

    .line 92
    .line 93
    invoke-direct {v14, v8, v12}, La/abu;-><init>(La/gii0;B)V

    .line 94
    .line 95
    .line 96
    iget-object v8, v3, La/o3c;->b:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v15, v8

    .line 99
    check-cast v15, La/dzz;

    .line 100
    .line 101
    iget-object v8, v3, La/o3c;->c:Ljava/lang/Object;

    .line 102
    .line 103
    move-object/from16 v16, v8

    .line 104
    .line 105
    check-cast v16, La/xio;

    .line 106
    .line 107
    iget-object v8, v3, La/o3c;->d:Ljava/lang/Object;

    .line 108
    .line 109
    move-object/from16 v17, v8

    .line 110
    .line 111
    check-cast v17, La/czz;

    .line 112
    .line 113
    iget-object v8, v3, La/o3c;->e:Ljava/lang/Object;

    .line 114
    .line 115
    move-object/from16 v18, v8

    .line 116
    .line 117
    check-cast v18, La/btt0;

    .line 118
    .line 119
    iget-object v8, v3, La/o3c;->f:Ljava/lang/Object;

    .line 120
    .line 121
    move-object/from16 v19, v8

    .line 122
    .line 123
    check-cast v19, La/knf0;

    .line 124
    .line 125
    invoke-direct/range {v13 .. v19}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v6, v13}, La/f5a;-><init>(La/pzu;)V

    .line 129
    .line 130
    .line 131
    iget-object v8, v3, La/o3c;->h:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, La/ctf0;

    .line 134
    .line 135
    iget-object v9, v3, La/o3c;->i:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v9, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    iget-object v3, v3, La/o3c;->j:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v3, La/sa10;

    .line 146
    .line 147
    move/from16 v20, v9

    .line 148
    .line 149
    move-object v9, v3

    .line 150
    move-object v3, v7

    .line 151
    move-object v7, v8

    .line 152
    move/from16 v8, v20

    .line 153
    .line 154
    invoke-direct/range {v0 .. v9}, La/p9k;-><init>(La/i1w0;La/tqt;La/yfu;La/nou;La/m0u;La/f5a;La/ctf0;ILa/sa10;)V

    .line 155
    .line 156
    .line 157
    return-object v0
.end method
