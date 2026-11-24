.class public final La/mp1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/List;


# instance fields
.field public final a:La/q7d0;

.field public final b:La/zoq0;

.field public final c:La/knf0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/kp1;->a:La/kp1;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/mp1;->d:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/q7d0;La/knf0;La/zoq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/mp1;->a:La/q7d0;

    .line 14
    .line 15
    iput-object p3, p0, La/mp1;->b:La/zoq0;

    .line 16
    .line 17
    iput-object p2, p0, La/mp1;->c:La/knf0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    const-string v0, "TIPS_AGGREGATOR_SLOTS_SHOWED"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/mp1;->a:La/q7d0;

    .line 5
    .line 6
    invoke-static {p0, v0, v1}, La/ua80;->c(La/q7d0;Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method
