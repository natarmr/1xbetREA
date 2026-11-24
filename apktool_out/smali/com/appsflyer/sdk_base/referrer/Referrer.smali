.class public abstract Lcom/appsflyer/sdk_base/referrer/Referrer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;,
        Lcom/appsflyer/sdk_base/referrer/Referrer$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 \"2\u00020\u0001:\u0002\"#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0008\u0010\u001f\u001a\u00020\u001bH\u0014J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/referrer/Referrer;",
        "",
        "type",
        "",
        "source",
        "prop",
        "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V",
        "getType",
        "()Ljava/lang/String;",
        "getSource",
        "getProp",
        "()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "startTime",
        "",
        "value",
        "Lcom/appsflyer/sdk_base/referrer/Referrer$State;",
        "state",
        "getState",
        "()Lcom/appsflyer/sdk_base/referrer/Referrer$State;",
        "map",
        "",
        "referrerDataCollectionFinishedCallbacks",
        "",
        "Ljava/lang/Runnable;",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
        "finish",
        "addLatency",
        "setAdditionalReferrerDataCollectionFinishedCallback",
        "additionalReferrerDataCollectionFinishedCallback",
        "Companion",
        "State",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

.field private static final externalReferrers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/Pair<",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

.field private referrerDataCollectionFinishedCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/String;

.field private startTime:J

.field private state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->externalReferrers:Ljava/util/Set;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 15
    .line 16
    sget-object p1, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    .line 33
    .line 34
    return-void
.end method

.method public static final synthetic access$getExternalReferrers$cp()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->externalReferrers:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final addExternalReferrers(Lkotlin/Pair;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;+",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;)Z"
        }
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0, p0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->addExternalReferrers(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static final clearExternalReferrersForTesting()V
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->clearExternalReferrersForTesting()V

    return-void
.end method

.method public static final getExternalReferrers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lkotlin/Pair<",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;>;"
        }
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->getExternalReferrers()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addLatency()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v3, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->startTime:J

    .line 8
    .line 9
    sub-long/2addr v1, v3

    .line 10
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "latency"

    .line 15
    .line 16
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final finish()V
    .locals 3

    .line 1
    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->FINISHED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 6
    .line 7
    const-string v1, "type"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 15
    .line 16
    const-string v1, "source"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->addLatency()V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Runnable;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method public final getProp()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAdditionalReferrerDataCollectionFinishedCallback(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final start()V
    .locals 2

    .line 1
    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->startTime:J

    .line 10
    .line 11
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getListener()Ljava/lang/Runnable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public abstract start(Landroid/content/Context;)V
.end method
