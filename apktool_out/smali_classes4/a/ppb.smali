.class public final La/ppb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/l1u;

.field public final b:La/qni0;

.field public final c:La/itt;

.field public final d:La/pbt;


# direct methods
.method public constructor <init>(La/l1u;La/qni0;La/itt;La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ppb;->a:La/l1u;

    .line 14
    .line 15
    iput-object p2, p0, La/ppb;->b:La/qni0;

    .line 16
    .line 17
    iput-object p3, p0, La/ppb;->c:La/itt;

    .line 18
    .line 19
    iput-object p4, p0, La/ppb;->d:La/pbt;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ppb;->d:La/pbt;

    .line 2
    .line 3
    iget-object v0, v0, La/pbt;->a:La/j5t;

    .line 4
    .line 5
    iget-wide v1, v0, La/j5t;->w:D

    .line 6
    .line 7
    iget-object v3, p0, La/ppb;->a:La/l1u;

    .line 8
    .line 9
    invoke-virtual {v3}, La/l1u;->a()D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmpg-double v1, v1, v3

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, La/ppb;->c:La/itt;

    .line 18
    .line 19
    invoke-virtual {v0}, La/itt;->a()D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-wide v0, v0, La/j5t;->w:D

    .line 25
    .line 26
    :goto_0
    iget-object p0, p0, La/ppb;->b:La/qni0;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, La/qni0;->a(D)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
