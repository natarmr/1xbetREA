.class public abstract La/d0q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/d0q0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;La/cb50;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, La/cb50;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static b(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;La/i1w0;)La/xwi;
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v12, La/d0q0;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v12, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/xwi;

    .line 14
    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    invoke-static {p1}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, La/af3;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, La/af3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v2

    .line 30
    :goto_0
    const-class v1, La/c0q0;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/o5d0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/ze3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v0, v2

    .line 54
    :goto_1
    instance-of v4, v0, La/c0q0;

    .line 55
    .line 56
    if-nez v4, :cond_2

    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :cond_2
    check-cast v0, La/c0q0;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v1, v0, La/c0q0;->a:La/cad;

    .line 64
    .line 65
    iget-object v5, v0, La/c0q0;->b:La/duj;

    .line 66
    .line 67
    iget-object v6, v0, La/c0q0;->c:La/gii0;

    .line 68
    .line 69
    iget-object v7, v0, La/c0q0;->d:La/m1e;

    .line 70
    .line 71
    iget-object v2, v0, La/c0q0;->e:La/wyu;

    .line 72
    .line 73
    iget-object v8, v0, La/c0q0;->f:La/ocl;

    .line 74
    .line 75
    iget-object v9, v0, La/c0q0;->g:La/ctf0;

    .line 76
    .line 77
    iget-object v10, v0, La/c0q0;->h:La/knf0;

    .line 78
    .line 79
    iget-object v11, v0, La/c0q0;->i:La/ii;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, La/xwi;

    .line 100
    .line 101
    move-object v3, p0

    .line 102
    move-object v2, p2

    .line 103
    move-object/from16 v4, p3

    .line 104
    .line 105
    invoke-direct/range {v0 .. v11}, La/xwi;-><init>(La/cad;Ljava/lang/String;Ljava/lang/String;La/i1w0;La/duj;La/gii0;La/m1e;La/ocl;La/ctf0;La/knf0;La/ii;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v12, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 113
    .line 114
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_4
    return-object v0
.end method
