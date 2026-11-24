.class public final La/cri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/ppi;


# direct methods
.method public constructor <init>(La/ppi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cri;->a:La/ppi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 19

    .line 1
    new-instance v0, La/nde0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/cri;->a:La/ppi;

    .line 6
    .line 7
    iget-object v1, v1, La/ppi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/dri;

    .line 10
    .line 11
    iget-object v2, v1, La/dri;->a:La/i1w0;

    .line 12
    .line 13
    new-instance v3, La/f5a;

    .line 14
    .line 15
    new-instance v4, La/pzu;

    .line 16
    .line 17
    new-instance v5, La/abu;

    .line 18
    .line 19
    iget-object v6, v1, La/dri;->b:La/gii0;

    .line 20
    .line 21
    const/16 v11, 0x19

    .line 22
    .line 23
    invoke-direct {v5, v6, v11}, La/abu;-><init>(La/gii0;B)V

    .line 24
    .line 25
    .line 26
    iget-object v6, v1, La/dri;->c:La/dzz;

    .line 27
    .line 28
    iget-object v7, v1, La/dri;->d:La/xio;

    .line 29
    .line 30
    iget-object v8, v1, La/dri;->e:La/czz;

    .line 31
    .line 32
    iget-object v9, v1, La/dri;->f:La/btt0;

    .line 33
    .line 34
    iget-object v10, v1, La/dri;->g:La/knf0;

    .line 35
    .line 36
    invoke-direct/range {v4 .. v10}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v4}, La/f5a;-><init>(La/pzu;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, La/mtt;

    .line 43
    .line 44
    new-instance v12, La/pzu;

    .line 45
    .line 46
    new-instance v13, La/abu;

    .line 47
    .line 48
    iget-object v5, v1, La/dri;->b:La/gii0;

    .line 49
    .line 50
    invoke-direct {v13, v5, v11}, La/abu;-><init>(La/gii0;B)V

    .line 51
    .line 52
    .line 53
    iget-object v14, v1, La/dri;->c:La/dzz;

    .line 54
    .line 55
    iget-object v15, v1, La/dri;->d:La/xio;

    .line 56
    .line 57
    iget-object v5, v1, La/dri;->e:La/czz;

    .line 58
    .line 59
    iget-object v6, v1, La/dri;->f:La/btt0;

    .line 60
    .line 61
    iget-object v7, v1, La/dri;->g:La/knf0;

    .line 62
    .line 63
    move-object/from16 v16, v5

    .line 64
    .line 65
    move-object/from16 v17, v6

    .line 66
    .line 67
    move-object/from16 v18, v7

    .line 68
    .line 69
    invoke-direct/range {v12 .. v18}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    invoke-direct {v4, v12, v5}, La/mtt;-><init>(La/pzu;B)V

    .line 74
    .line 75
    .line 76
    iget-object v5, v1, La/dri;->h:La/duj;

    .line 77
    .line 78
    move-object/from16 v1, p1

    .line 79
    .line 80
    invoke-direct/range {v0 .. v5}, La/nde0;-><init>(La/vzg0;La/i1w0;La/f5a;La/mtt;La/duj;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
