.class public final La/sa10;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/bzt;


# direct methods
.method public constructor <init>(La/bzt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sa10;->a:La/bzt;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;
    .locals 7

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const p3, 0x7f130792

    .line 6
    .line 7
    .line 8
    :cond_0
    move v3, p3

    .line 9
    and-int/lit8 p3, p5, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move v2, p2

    .line 20
    invoke-virtual/range {v0 .. v6}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    new-instance p0, La/ra10;

    .line 3
    .line 4
    sget-object v1, La/pb10;->c:La/xuz;

    .line 5
    .line 6
    iget-object v0, v0, La/sa10;->a:La/bzt;

    .line 7
    .line 8
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 9
    .line 10
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, La/v8d;->r:I

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, La/xuz;->a(La/pb10;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-direct/range {p0 .. p6}, La/ra10;-><init>(IIILkotlin/jvm/functions/Function0;J)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method
