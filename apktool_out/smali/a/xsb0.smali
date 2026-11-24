.class public final La/xsb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wbj;


# instance fields
.field public final a:La/wbj;


# direct methods
.method public constructor <init>(La/wbj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xsb0;->a:La/wbj;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/kyh;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {v0, p1, v1, v2}, La/kyh;-><init>(Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/xsb0;->a:La/wbj;

    .line 9
    .line 10
    invoke-interface {p0, v0, p2}, La/wbj;->a(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getData()La/gmq;
    .locals 0

    .line 1
    iget-object p0, p0, La/xsb0;->a:La/wbj;

    .line 2
    .line 3
    invoke-interface {p0}, La/wbj;->getData()La/gmq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
