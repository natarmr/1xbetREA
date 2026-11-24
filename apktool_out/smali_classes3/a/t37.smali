.class public final La/t37;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;


# direct methods
.method public static a()Ljava/util/ArrayList;
    .locals 10

    .line 1
    sget-object v0, La/q4f;->c:La/q4f;

    .line 2
    .line 3
    sget-object v1, La/q4f;->d:La/q4f;

    .line 4
    .line 5
    sget-object v2, La/q4f;->e:La/q4f;

    .line 6
    .line 7
    sget-object v3, La/q4f;->f:La/q4f;

    .line 8
    .line 9
    sget-object v4, La/q4f;->g:La/q4f;

    .line 10
    .line 11
    sget-object v5, La/q4f;->h:La/q4f;

    .line 12
    .line 13
    sget-object v6, La/q4f;->i:La/q4f;

    .line 14
    .line 15
    sget-object v7, La/q4f;->j:La/q4f;

    .line 16
    .line 17
    sget-object v8, La/q4f;->k:La/q4f;

    .line 18
    .line 19
    sget-object v9, La/q4f;->l:La/q4f;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [La/q4f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, La/q4f;

    .line 55
    .line 56
    new-instance v3, La/un7;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-direct {v3, v2, v4}, La/un7;-><init>(La/q4f;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    return-object v1
.end method
