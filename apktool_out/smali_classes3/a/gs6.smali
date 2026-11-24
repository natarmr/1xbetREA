.class public final La/gs6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:La/qoj0;

.field public final e:Ljava/util/HashMap;

.field public f:Z

.field public g:La/gio;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/gs6;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/gs6;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/gs6;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    sget-object v0, La/i99;->b:La/i99;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const/4 v2, 0x1

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/gs6;->d:La/qoj0;

    .line 35
    .line 36
    new-instance v0, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/gs6;->e:Ljava/util/HashMap;

    .line 42
    .line 43
    iput-boolean v2, p0, La/gs6;->f:Z

    .line 44
    .line 45
    sget-object v0, La/gio;->d:La/gio;

    .line 46
    .line 47
    iput-object v0, p0, La/gs6;->g:La/gio;

    .line 48
    .line 49
    return-void
.end method
