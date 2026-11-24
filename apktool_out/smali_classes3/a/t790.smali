.class public final La/t790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/ntu;

.field public final b:La/r9u;

.field public final c:La/sa10;

.field public final d:La/m1e;

.field public final e:La/oeg0;

.field public final f:La/j1q0;

.field public final g:La/cad;

.field public final h:La/wdk0;

.field public final i:La/ocl;


# direct methods
.method public constructor <init>(La/ntu;La/r9u;La/zri;La/sa10;La/m1e;La/oeg0;La/duj;La/j1q0;La/cad;La/wdk0;La/ocl;)V
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
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/t790;->a:La/ntu;

    .line 20
    .line 21
    iput-object p2, p0, La/t790;->b:La/r9u;

    .line 22
    .line 23
    iput-object p4, p0, La/t790;->c:La/sa10;

    .line 24
    .line 25
    iput-object p5, p0, La/t790;->d:La/m1e;

    .line 26
    .line 27
    iput-object p6, p0, La/t790;->e:La/oeg0;

    .line 28
    .line 29
    iput-object p8, p0, La/t790;->f:La/j1q0;

    .line 30
    .line 31
    iput-object p9, p0, La/t790;->g:La/cad;

    .line 32
    .line 33
    iput-object p10, p0, La/t790;->h:La/wdk0;

    .line 34
    .line 35
    iput-object p11, p0, La/t790;->i:La/ocl;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;)La/o3c;
    .locals 11

    .line 1
    iget-object v4, p0, La/t790;->b:La/r9u;

    .line 2
    .line 3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v6, p0, La/t790;->d:La/m1e;

    .line 7
    .line 8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v7, p0, La/t790;->e:La/oeg0;

    .line 12
    .line 13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v8, p0, La/t790;->f:La/j1q0;

    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v9, p0, La/t790;->h:La/wdk0;

    .line 22
    .line 23
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/o3c;

    .line 27
    .line 28
    iget-object v1, p0, La/t790;->g:La/cad;

    .line 29
    .line 30
    iget-object v3, p0, La/t790;->a:La/ntu;

    .line 31
    .line 32
    iget-object v5, p0, La/t790;->c:La/sa10;

    .line 33
    .line 34
    iget-object v10, p0, La/t790;->i:La/ocl;

    .line 35
    .line 36
    move-object v2, p1

    .line 37
    invoke-direct/range {v0 .. v10}, La/o3c;-><init>(La/cad;Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;La/ntu;La/r9u;La/sa10;La/m1e;La/oeg0;La/j1q0;La/wdk0;La/ocl;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
