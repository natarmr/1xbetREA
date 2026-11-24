.class public final La/efy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ypy;


# instance fields
.field public final a:La/zpy;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zpy;

    .line 5
    .line 6
    const-class v1, La/efy;

    .line 7
    .line 8
    sget-object v2, La/sre0;->a:La/tre0;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, La/zpy;-><init>(La/sgy;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/efy;->a:La/zpy;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final getType()La/zpy;
    .locals 0

    .line 1
    iget-object p0, p0, La/efy;->a:La/zpy;

    .line 2
    .line 3
    return-object p0
.end method
