.class public final La/nti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nti;->a:La/fri;

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
    new-instance v0, La/imi0;

    .line 6
    .line 7
    new-instance v2, La/art;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p0

    .line 13
    .line 14
    iget-object v3, v3, La/nti;->a:La/fri;

    .line 15
    .line 16
    iget-object v3, v3, La/fri;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/g45;

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
    iget-object v7, v3, La/g45;->a:Ljava/lang/Object;

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
    iget-object v7, v3, La/g45;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/dzz;

    .line 38
    .line 39
    iget-object v8, v3, La/g45;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, La/xio;

    .line 42
    .line 43
    iget-object v9, v3, La/g45;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v9, La/czz;

    .line 46
    .line 47
    iget-object v10, v3, La/g45;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, La/btt0;

    .line 50
    .line 51
    iget-object v11, v3, La/g45;->f:Ljava/lang/Object;

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
    move-object v5, v4

    .line 62
    new-instance v4, La/f5a;

    .line 63
    .line 64
    new-instance v13, La/pzu;

    .line 65
    .line 66
    new-instance v14, La/abu;

    .line 67
    .line 68
    iget-object v6, v3, La/g45;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, La/gii0;

    .line 71
    .line 72
    invoke-direct {v14, v6, v12}, La/abu;-><init>(La/gii0;B)V

    .line 73
    .line 74
    .line 75
    iget-object v6, v3, La/g45;->b:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v15, v6

    .line 78
    check-cast v15, La/dzz;

    .line 79
    .line 80
    iget-object v6, v3, La/g45;->c:Ljava/lang/Object;

    .line 81
    .line 82
    move-object/from16 v16, v6

    .line 83
    .line 84
    check-cast v16, La/xio;

    .line 85
    .line 86
    iget-object v6, v3, La/g45;->d:Ljava/lang/Object;

    .line 87
    .line 88
    move-object/from16 v17, v6

    .line 89
    .line 90
    check-cast v17, La/czz;

    .line 91
    .line 92
    iget-object v6, v3, La/g45;->e:Ljava/lang/Object;

    .line 93
    .line 94
    move-object/from16 v18, v6

    .line 95
    .line 96
    check-cast v18, La/btt0;

    .line 97
    .line 98
    iget-object v6, v3, La/g45;->f:Ljava/lang/Object;

    .line 99
    .line 100
    move-object/from16 v19, v6

    .line 101
    .line 102
    check-cast v19, La/knf0;

    .line 103
    .line 104
    invoke-direct/range {v13 .. v19}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v4, v13}, La/f5a;-><init>(La/pzu;)V

    .line 108
    .line 109
    .line 110
    iget-object v6, v3, La/g45;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, La/ctf0;

    .line 113
    .line 114
    iget-object v3, v3, La/g45;->h:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, La/sa10;

    .line 117
    .line 118
    move-object/from16 v20, v6

    .line 119
    .line 120
    move-object v6, v3

    .line 121
    move-object v3, v5

    .line 122
    move-object/from16 v5, v20

    .line 123
    .line 124
    invoke-direct/range {v0 .. v6}, La/imi0;-><init>(La/i1w0;La/art;La/yfu;La/f5a;La/ctf0;La/sa10;)V

    .line 125
    .line 126
    .line 127
    return-object v0
.end method
