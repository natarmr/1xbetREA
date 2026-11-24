.class public final La/pph0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/lef0;

.field public final b:La/d1p;

.field public final c:La/onv;

.field public final d:La/sek;

.field public final e:La/mi70;

.field public final f:La/zn00;

.field public final g:La/svs0;

.field public final h:La/gbi;


# direct methods
.method public constructor <init>(La/lef0;La/d1p;La/onv;La/sek;La/mi70;La/zn00;La/svs0;La/gbi;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pph0;->a:La/lef0;

    .line 8
    .line 9
    iput-object p2, p0, La/pph0;->b:La/d1p;

    .line 10
    .line 11
    iput-object p3, p0, La/pph0;->c:La/onv;

    .line 12
    .line 13
    iput-object p4, p0, La/pph0;->d:La/sek;

    .line 14
    .line 15
    iput-object p5, p0, La/pph0;->e:La/mi70;

    .line 16
    .line 17
    iput-object p6, p0, La/pph0;->f:La/zn00;

    .line 18
    .line 19
    iput-object p7, p0, La/pph0;->g:La/svs0;

    .line 20
    .line 21
    iput-object p8, p0, La/pph0;->h:La/gbi;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)La/zsi;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v3, p0, La/pph0;->b:La/d1p;

    .line 5
    .line 6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, La/zsi;

    .line 10
    .line 11
    iget-object v1, p0, La/pph0;->h:La/gbi;

    .line 12
    .line 13
    iget-object v2, p0, La/pph0;->a:La/lef0;

    .line 14
    .line 15
    iget-object v4, p0, La/pph0;->c:La/onv;

    .line 16
    .line 17
    iget-object v6, p0, La/pph0;->d:La/sek;

    .line 18
    .line 19
    iget-object v7, p0, La/pph0;->e:La/mi70;

    .line 20
    .line 21
    iget-object v8, p0, La/pph0;->f:La/zn00;

    .line 22
    .line 23
    iget-object v9, p0, La/pph0;->g:La/svs0;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    invoke-direct/range {v0 .. v9}, La/zsi;-><init>(La/gbi;La/lef0;La/d1p;La/onv;La/i1w0;La/sek;La/mi70;La/zn00;La/svs0;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method
