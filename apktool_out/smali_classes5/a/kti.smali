.class public final La/kti;
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
    iput-object p1, p0, La/kti;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 11

    .line 1
    new-instance v0, La/cai0;

    .line 2
    .line 3
    iget-object p0, p0, La/kti;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/jti;

    .line 8
    .line 9
    iget-object v2, p0, La/jti;->a:La/i1w0;

    .line 10
    .line 11
    new-instance v3, La/f5a;

    .line 12
    .line 13
    new-instance v4, La/pzu;

    .line 14
    .line 15
    new-instance v5, La/abu;

    .line 16
    .line 17
    iget-object v1, p0, La/jti;->b:La/gii0;

    .line 18
    .line 19
    const/16 v6, 0x19

    .line 20
    .line 21
    invoke-direct {v5, v1, v6}, La/abu;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iget-object v6, p0, La/jti;->c:La/dzz;

    .line 25
    .line 26
    iget-object v7, p0, La/jti;->d:La/xio;

    .line 27
    .line 28
    iget-object v8, p0, La/jti;->e:La/czz;

    .line 29
    .line 30
    iget-object v9, p0, La/jti;->f:La/btt0;

    .line 31
    .line 32
    iget-object v10, p0, La/jti;->g:La/knf0;

    .line 33
    .line 34
    invoke-direct/range {v4 .. v10}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, v4}, La/f5a;-><init>(La/pzu;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, p0, La/jti;->h:La/vd1;

    .line 41
    .line 42
    iget-object v5, p0, La/jti;->i:La/duj;

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    invoke-direct/range {v0 .. v5}, La/cai0;-><init>(La/vzg0;La/i1w0;La/f5a;La/vd1;La/duj;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
