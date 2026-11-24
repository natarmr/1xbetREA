.class public final La/hj8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/cad;

.field public final b:La/pru;

.field public final c:La/duj;

.field public final d:La/sa10;

.field public final e:La/ocl;

.field public final f:La/ctf0;

.field public final g:La/pbt;

.field public final h:La/gst0;


# direct methods
.method public constructor <init>(La/cad;La/pru;La/duj;La/sa10;La/ocl;La/ctf0;La/pbt;La/gst0;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/hj8;->a:La/cad;

    .line 14
    .line 15
    iput-object p2, p0, La/hj8;->b:La/pru;

    .line 16
    .line 17
    iput-object p3, p0, La/hj8;->c:La/duj;

    .line 18
    .line 19
    iput-object p4, p0, La/hj8;->d:La/sa10;

    .line 20
    .line 21
    iput-object p5, p0, La/hj8;->e:La/ocl;

    .line 22
    .line 23
    iput-object p6, p0, La/hj8;->f:La/ctf0;

    .line 24
    .line 25
    iput-object p7, p0, La/hj8;->g:La/pbt;

    .line 26
    .line 27
    iput-object p8, p0, La/hj8;->h:La/gst0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)La/daf;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v6, p0, La/hj8;->f:La/ctf0;

    .line 5
    .line 6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v7, p0, La/hj8;->g:La/pbt;

    .line 10
    .line 11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v8, p0, La/hj8;->h:La/gst0;

    .line 15
    .line 16
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, La/daf;

    .line 20
    .line 21
    iget-object v1, p0, La/hj8;->a:La/cad;

    .line 22
    .line 23
    iget-object v2, p0, La/hj8;->b:La/pru;

    .line 24
    .line 25
    iget-object v3, p0, La/hj8;->c:La/duj;

    .line 26
    .line 27
    iget-object v4, p0, La/hj8;->d:La/sa10;

    .line 28
    .line 29
    iget-object v5, p0, La/hj8;->e:La/ocl;

    .line 30
    .line 31
    move-object v9, p1

    .line 32
    invoke-direct/range {v0 .. v9}, La/daf;-><init>(La/cad;La/pru;La/duj;La/sa10;La/ocl;La/ctf0;La/pbt;La/gst0;La/i1w0;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method
