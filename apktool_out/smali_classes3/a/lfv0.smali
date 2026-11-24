.class public final La/lfv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/lbu;

.field public final b:La/ctf0;

.field public final c:La/ocl;

.field public final d:La/cad;

.field public final e:La/pfv0;


# direct methods
.method public constructor <init>(La/lbu;La/ctf0;La/ocl;La/cad;La/pfv0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/lfv0;->a:La/lbu;

    .line 11
    .line 12
    iput-object p2, p0, La/lfv0;->b:La/ctf0;

    .line 13
    .line 14
    iput-object p3, p0, La/lfv0;->c:La/ocl;

    .line 15
    .line 16
    iput-object p4, p0, La/lfv0;->d:La/cad;

    .line 17
    .line 18
    iput-object p5, p0, La/lfv0;->e:La/pfv0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)La/szi;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v4, p0, La/lfv0;->b:La/ctf0;

    .line 5
    .line 6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v6, p0, La/lfv0;->e:La/pfv0;

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/szi;

    .line 15
    .line 16
    iget-object v1, p0, La/lfv0;->d:La/cad;

    .line 17
    .line 18
    iget-object v3, p0, La/lfv0;->a:La/lbu;

    .line 19
    .line 20
    iget-object v5, p0, La/lfv0;->c:La/ocl;

    .line 21
    .line 22
    move-object v2, p1

    .line 23
    invoke-direct/range {v0 .. v6}, La/szi;-><init>(La/cad;La/i1w0;La/lbu;La/ctf0;La/ocl;La/pfv0;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
