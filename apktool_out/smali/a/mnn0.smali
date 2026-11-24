.class public final La/mnn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/okj;


# static fields
.field public static final d:La/rgn0;


# instance fields
.field public final a:La/y1x;

.field public final b:La/a780;

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/rgn0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/rgn0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/mnn0;->d:La/rgn0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/y1x;La/a780;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mnn0;->a:La/y1x;

    .line 5
    .line 6
    iput-object p2, p0, La/mnn0;->b:La/a780;

    .line 7
    .line 8
    iput-object p3, p0, La/mnn0;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, La/jfm0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 9
    .line 10
    check-cast p1, La/zje;

    .line 11
    .line 12
    new-instance v1, La/kaw;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    invoke-direct {v1, v0, v2, v3}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
