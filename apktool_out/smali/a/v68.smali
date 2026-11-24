.class public final La/v68;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nkj;


# instance fields
.field public final a:La/gbi0;

.field public final b:La/uko;


# direct methods
.method public constructor <init>(La/gbi0;La/uko;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v68;->a:La/gbi0;

    .line 5
    .line 6
    iput-object p2, p0, La/v68;->b:La/uko;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/hmk0;La/a780;)La/okj;
    .locals 2

    .line 1
    new-instance v0, La/x68;

    .line 2
    .line 3
    iget-object p1, p1, La/hmk0;->a:La/y1x;

    .line 4
    .line 5
    iget-object v1, p0, La/v68;->a:La/gbi0;

    .line 6
    .line 7
    iget-object p0, p0, La/v68;->b:La/uko;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, v1, p0}, La/x68;-><init>(La/y1x;La/a780;La/gbi0;La/uko;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
