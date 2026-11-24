.class public final synthetic La/u2x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yy3;


# static fields
.field public static final synthetic a:La/u2x0;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/u2x0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u2x0;->a:La/u2x0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)La/ig00;
    .locals 2

    .line 1
    check-cast p1, La/qa3;

    .line 2
    .line 3
    new-instance p0, La/s2x0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/qa3;->getStatusCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v0, v1, p1}, La/s2x0;-><init>(ILjava/lang/String;La/qa3;)V

    .line 14
    .line 15
    .line 16
    throw p0
.end method
