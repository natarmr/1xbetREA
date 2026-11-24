.class public final La/pub0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fpt0;
.implements La/w0x;
.implements La/bcq0;


# instance fields
.field public final a:La/b780;


# direct methods
.method public constructor <init>(La/b780;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pub0;->a:La/b780;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()La/drd;
    .locals 0

    .line 1
    iget-object p0, p0, La/pub0;->a:La/b780;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()I
    .locals 1

    .line 1
    sget-object v0, La/h0x;->h0:La/u15;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
