.class public final La/ydi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ydi;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/hbg;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/ydi;->a:La/uci;

    .line 6
    .line 7
    iget-object v1, v1, La/uci;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/o3c;

    .line 10
    .line 11
    new-instance v2, La/tag;

    .line 12
    .line 13
    iget-object v3, v1, La/o3c;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, La/oeg0;

    .line 16
    .line 17
    new-instance v4, La/z1u;

    .line 18
    .line 19
    iget-object v5, v1, La/o3c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, La/ul9;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct {v4, v5, v6}, La/z1u;-><init>(La/ul9;B)V

    .line 25
    .line 26
    .line 27
    new-instance v7, La/y1u;

    .line 28
    .line 29
    invoke-direct {v7, v5, v6}, La/y1u;-><init>(La/ul9;B)V

    .line 30
    .line 31
    .line 32
    new-instance v8, La/a7q;

    .line 33
    .line 34
    invoke-direct {v8, v5}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3, v4, v7, v8}, La/tag;-><init>(La/oeg0;La/z1u;La/y1u;La/a7q;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, La/o3c;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, La/m1e;

    .line 43
    .line 44
    iget-object v4, v1, La/o3c;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, La/cad;

    .line 47
    .line 48
    iget-object v4, v4, La/cad;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, La/psc;

    .line 51
    .line 52
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v5, v1, La/o3c;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, La/g2v;

    .line 62
    .line 63
    new-instance v7, La/nmo;

    .line 64
    .line 65
    iget-object v8, v1, La/o3c;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, La/ul9;

    .line 68
    .line 69
    invoke-direct {v7, v8}, La/nmo;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v9, v7

    .line 73
    new-instance v7, La/g2v;

    .line 74
    .line 75
    invoke-direct {v7, v8}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v10, La/fhj;

    .line 79
    .line 80
    new-instance v11, La/z1u;

    .line 81
    .line 82
    invoke-direct {v11, v8, v6}, La/z1u;-><init>(La/ul9;B)V

    .line 83
    .line 84
    .line 85
    new-instance v6, La/uyn;

    .line 86
    .line 87
    invoke-direct {v6, v8}, La/uyn;-><init>(La/ul9;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v10, v11, v6}, La/fhj;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v6, v9

    .line 94
    new-instance v9, La/z1u;

    .line 95
    .line 96
    const/4 v11, 0x1

    .line 97
    invoke-direct {v9, v8, v11}, La/z1u;-><init>(La/ul9;B)V

    .line 98
    .line 99
    .line 100
    iget-object v11, v1, La/o3c;->f:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v11, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 103
    .line 104
    iget-object v12, v1, La/o3c;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v12, La/duj;

    .line 107
    .line 108
    move-object v13, v10

    .line 109
    move-object v10, v11

    .line 110
    move-object v11, v12

    .line 111
    new-instance v12, La/uoc;

    .line 112
    .line 113
    invoke-direct {v12, v8}, La/uoc;-><init>(La/ul9;)V

    .line 114
    .line 115
    .line 116
    iget-object v8, v1, La/o3c;->h:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v8, La/poq0;

    .line 119
    .line 120
    iget-object v14, v1, La/o3c;->i:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v14, La/ctf0;

    .line 123
    .line 124
    iget-object v1, v1, La/o3c;->j:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v15, v1

    .line 127
    check-cast v15, La/pru;

    .line 128
    .line 129
    move-object v1, v13

    .line 130
    move-object v13, v8

    .line 131
    move-object v8, v1

    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    invoke-direct/range {v0 .. v15}, La/hbg;-><init>(La/vzg0;La/tag;La/m1e;La/mne;La/g2v;La/nmo;La/g2v;La/fhj;La/z1u;Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;La/duj;La/uoc;La/poq0;La/ctf0;La/pru;)V

    .line 135
    .line 136
    .line 137
    return-object v0
.end method
