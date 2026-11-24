.class public final La/ixi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/xvi;


# direct methods
.method public constructor <init>(La/xvi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ixi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/wmq0;

    .line 2
    .line 3
    iget-object p0, p0, La/ixi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/dri;

    .line 8
    .line 9
    iget-object v1, p0, La/dri;->a:La/i1w0;

    .line 10
    .line 11
    new-instance v2, La/f5a;

    .line 12
    .line 13
    new-instance v3, La/pzu;

    .line 14
    .line 15
    new-instance v4, La/abu;

    .line 16
    .line 17
    iget-object v5, p0, La/dri;->b:La/gii0;

    .line 18
    .line 19
    const/16 v6, 0x19

    .line 20
    .line 21
    invoke-direct {v4, v5, v6}, La/abu;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, La/dri;->c:La/dzz;

    .line 25
    .line 26
    iget-object v6, p0, La/dri;->d:La/xio;

    .line 27
    .line 28
    iget-object v7, p0, La/dri;->e:La/czz;

    .line 29
    .line 30
    iget-object v8, p0, La/dri;->f:La/btt0;

    .line 31
    .line 32
    iget-object v9, p0, La/dri;->g:La/knf0;

    .line 33
    .line 34
    invoke-direct/range {v3 .. v9}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3}, La/f5a;-><init>(La/pzu;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/dri;->h:La/duj;

    .line 41
    .line 42
    invoke-direct {v0, p1, v1, v2, p0}, La/wmq0;-><init>(La/vzg0;La/i1w0;La/f5a;La/duj;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
