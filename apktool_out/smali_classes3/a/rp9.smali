.class public final La/rp9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/cad;

.field public final b:La/ctf0;

.field public final c:La/iw20;

.field public final d:La/yo4;

.field public final e:La/s64;

.field public final f:La/j1q0;


# direct methods
.method public constructor <init>(La/cad;La/ctf0;La/iw20;La/yo4;La/s64;La/j1q0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/rp9;->a:La/cad;

    .line 11
    .line 12
    iput-object p2, p0, La/rp9;->b:La/ctf0;

    .line 13
    .line 14
    iput-object p3, p0, La/rp9;->c:La/iw20;

    .line 15
    .line 16
    iput-object p4, p0, La/rp9;->d:La/yo4;

    .line 17
    .line 18
    iput-object p5, p0, La/rp9;->e:La/s64;

    .line 19
    .line 20
    iput-object p6, p0, La/rp9;->f:La/j1q0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)La/zai;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v4, p0, La/rp9;->b:La/ctf0;

    .line 5
    .line 6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v7, p0, La/rp9;->f:La/j1q0;

    .line 10
    .line 11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/zai;

    .line 15
    .line 16
    iget-object v1, p0, La/rp9;->a:La/cad;

    .line 17
    .line 18
    iget-object v2, p0, La/rp9;->c:La/iw20;

    .line 19
    .line 20
    iget-object v5, p0, La/rp9;->d:La/yo4;

    .line 21
    .line 22
    iget-object v6, p0, La/rp9;->e:La/s64;

    .line 23
    .line 24
    move-object v3, p1

    .line 25
    invoke-direct/range {v0 .. v7}, La/zai;-><init>(La/cad;La/iw20;La/i1w0;La/ctf0;La/yo4;La/s64;La/j1q0;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
