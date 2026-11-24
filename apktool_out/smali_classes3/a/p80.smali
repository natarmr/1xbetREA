.class public final La/p80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gmt;

.field public final b:La/ztt;

.field public final c:La/wkt0;

.field public final d:La/r80;

.field public final e:La/mne;


# direct methods
.method public constructor <init>(La/gmt;La/ztt;La/wkt0;La/r80;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p80;->a:La/gmt;

    .line 5
    .line 6
    iput-object p2, p0, La/p80;->b:La/ztt;

    .line 7
    .line 8
    iput-object p3, p0, La/p80;->c:La/wkt0;

    .line 9
    .line 10
    iput-object p4, p0, La/p80;->d:La/r80;

    .line 11
    .line 12
    iput-object p5, p0, La/p80;->e:La/mne;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/util/List;)D
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, La/t70;

    .line 21
    .line 22
    iget-wide v2, v2, La/t70;->a:D

    .line 23
    .line 24
    add-double/2addr v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-wide v0
.end method
