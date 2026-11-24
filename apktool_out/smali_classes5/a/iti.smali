.class public final La/iti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


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
    iput-object p1, p0, La/iti;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 19

    .line 1
    new-instance v0, La/jai0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/iti;->a:La/fri;

    .line 6
    .line 7
    iget-object v1, v1, La/fri;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/jti;

    .line 10
    .line 11
    iget-object v2, v1, La/jti;->a:La/i1w0;

    .line 12
    .line 13
    new-instance v3, La/ciu;

    .line 14
    .line 15
    new-instance v4, La/pzu;

    .line 16
    .line 17
    new-instance v5, La/abu;

    .line 18
    .line 19
    iget-object v6, v1, La/jti;->b:La/gii0;

    .line 20
    .line 21
    const/16 v11, 0x19

    .line 22
    .line 23
    invoke-direct {v5, v6, v11}, La/abu;-><init>(La/gii0;B)V

    .line 24
    .line 25
    .line 26
    iget-object v6, v1, La/jti;->c:La/dzz;

    .line 27
    .line 28
    iget-object v7, v1, La/jti;->d:La/xio;

    .line 29
    .line 30
    iget-object v8, v1, La/jti;->e:La/czz;

    .line 31
    .line 32
    iget-object v9, v1, La/jti;->f:La/btt0;

    .line 33
    .line 34
    iget-object v10, v1, La/jti;->g:La/knf0;

    .line 35
    .line 36
    invoke-direct/range {v4 .. v10}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v3, v4, v5}, La/ciu;-><init>(La/pzu;B)V

    .line 41
    .line 42
    .line 43
    new-instance v4, La/f5a;

    .line 44
    .line 45
    new-instance v12, La/pzu;

    .line 46
    .line 47
    new-instance v13, La/abu;

    .line 48
    .line 49
    iget-object v5, v1, La/jti;->b:La/gii0;

    .line 50
    .line 51
    invoke-direct {v13, v5, v11}, La/abu;-><init>(La/gii0;B)V

    .line 52
    .line 53
    .line 54
    iget-object v14, v1, La/jti;->c:La/dzz;

    .line 55
    .line 56
    iget-object v15, v1, La/jti;->d:La/xio;

    .line 57
    .line 58
    iget-object v5, v1, La/jti;->e:La/czz;

    .line 59
    .line 60
    iget-object v6, v1, La/jti;->f:La/btt0;

    .line 61
    .line 62
    iget-object v7, v1, La/jti;->g:La/knf0;

    .line 63
    .line 64
    move-object/from16 v16, v5

    .line 65
    .line 66
    move-object/from16 v17, v6

    .line 67
    .line 68
    move-object/from16 v18, v7

    .line 69
    .line 70
    invoke-direct/range {v12 .. v18}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v4, v12}, La/f5a;-><init>(La/pzu;)V

    .line 74
    .line 75
    .line 76
    iget-object v5, v1, La/jti;->h:La/vd1;

    .line 77
    .line 78
    iget-object v6, v1, La/jti;->i:La/duj;

    .line 79
    .line 80
    move-object/from16 v1, p1

    .line 81
    .line 82
    invoke-direct/range {v0 .. v6}, La/jai0;-><init>(La/vzg0;La/i1w0;La/ciu;La/f5a;La/vd1;La/duj;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method
