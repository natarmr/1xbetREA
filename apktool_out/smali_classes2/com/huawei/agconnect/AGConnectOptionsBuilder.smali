.class public final Lcom/huawei/agconnect/AGConnectOptionsBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/io/InputStream;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;
    .locals 3

    .line 1
    new-instance v0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->a:Ljava/io/InputStream;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->b:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->c:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2, p0}, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;-><init>(Landroid/content/Context;Ljava/io/InputStream;Ljava/util/HashMap;Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
