.class public Lcom/huawei/agconnect/core/impl/AGCInitFinishManagerImpl;
.super Lcom/huawei/agconnect/AGCInitFinishManager;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/core/impl/AGCInitFinishManagerImpl;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method
