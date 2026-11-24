.class public final La/d9d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/v0h0;


# instance fields
.field public final a:La/t33;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ksc0;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ksc0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/ljc0;

    .line 9
    .line 10
    const/16 v2, 0x14

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/ljc0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/v0h0;

    .line 16
    .line 17
    invoke-direct {v2, v1, v0}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, La/d9d0;->b:La/v0h0;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(La/t33;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d9d0;->a:La/t33;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v1, Ljava/lang/Float;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v6, 0xe

    .line 9
    .line 10
    iget-object v0, p0, La/d9d0;->a:La/t33;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v5, p1

    .line 15
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method
