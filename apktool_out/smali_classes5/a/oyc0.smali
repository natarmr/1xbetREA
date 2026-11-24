.class public final synthetic La/oyc0;
.super La/xo;
.source "SourceFile"

# interfaces
.implements La/zdr;


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/gfe;

    .line 3
    .line 4
    move-object v6, p2

    .line 5
    check-cast v6, La/gfe;

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    check-cast v7, La/gfe;

    .line 10
    .line 11
    move-object/from16 v8, p4

    .line 12
    .line 13
    check-cast v8, La/gfe;

    .line 14
    .line 15
    move-object/from16 p1, p5

    .line 16
    .line 17
    check-cast p1, La/yje;

    .line 18
    .line 19
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/qyc0;

    .line 22
    .line 23
    iget-object p1, p0, La/qyc0;->B:La/xae0;

    .line 24
    .line 25
    iget-object p1, p1, La/xae0;->a:La/n7m0;

    .line 26
    .line 27
    invoke-interface {p1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    move-object v0, p1

    .line 32
    check-cast v0, Ljava/util/List;

    .line 33
    .line 34
    iget-object p1, p0, La/qyc0;->p:La/pru;

    .line 35
    .line 36
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, La/sff0;->Z1:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, La/qyc0;->l:La/ctf0;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    new-array v1, p2, [Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 54
    .line 55
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const v1, 0x7f130ea4

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :cond_0
    move-object v11, p1

    .line 67
    iget-object v1, p0, La/qyc0;->u:La/zuc0;

    .line 68
    .line 69
    invoke-virtual {p0}, La/qyc0;->w()La/lc00;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v2, p0, La/qyc0;->l:La/ctf0;

    .line 74
    .line 75
    iget-object p1, p0, La/qyc0;->n:La/yfu;

    .line 76
    .line 77
    invoke-virtual {p1}, La/yfu;->j()V

    .line 78
    .line 79
    .line 80
    iget-object v10, p0, La/qyc0;->r:La/qho;

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/16 v12, 0x310

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-static/range {v0 .. v12}, La/fww;->w(Ljava/util/List;La/zuc0;La/ctf0;La/lc00;La/gfe;La/gfe;La/gfe;La/gfe;La/gfe;La/gfe;La/qho;Ljava/lang/String;I)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
