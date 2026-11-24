.class public La/qkj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e3g0;


# instance fields
.field public final a:La/vv40;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/vv40;)V
    .locals 1

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
    iput-object v0, p0, La/qkj;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, La/qkj;->a:La/vv40;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(La/d3g0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/qkj;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(La/gv90;)La/chf0;
    .locals 1

    .line 1
    new-instance p0, La/chf0;

    .line 2
    .line 3
    new-instance v0, La/nhf0;

    .line 4
    .line 5
    invoke-direct {v0, p1}, La/nhf0;-><init>(La/mjq;)V

    .line 6
    .line 7
    .line 8
    const/16 p1, 0xc

    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
