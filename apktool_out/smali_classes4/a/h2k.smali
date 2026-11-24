.class public final La/h2k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Lorg/xplatform/uikit/components/header/DsHeader;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/header/DsHeader;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h2k;->a:B

    iput-object p1, p0, La/h2k;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h2k;->a:B

    iget-object p0, p0, La/h2k;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    return-object p0
.end method
