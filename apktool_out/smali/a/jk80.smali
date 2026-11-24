.class public final La/jk80;
.super Landroidx/compose/foundation/lazy/layout/b;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:La/zz2;


# direct methods
.method public constructor <init>(La/ydr;Lkotlin/jvm/functions/Function1;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/jk80;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance v0, La/zz2;

    .line 7
    .line 8
    const/16 v1, 0xe

    .line 9
    .line 10
    invoke-direct {v0, v1}, La/zz2;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/gk80;

    .line 14
    .line 15
    invoke-direct {v1, p2, p1}, La/gk80;-><init>(Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3, v1}, La/zz2;->a(ILa/waz;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/jk80;->b:La/zz2;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b()La/zz2;
    .locals 0

    .line 1
    iget-object p0, p0, La/jk80;->b:La/zz2;

    .line 2
    .line 3
    return-object p0
.end method
