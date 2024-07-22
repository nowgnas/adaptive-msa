package msa.adaptive.common.domain.value;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Audit {
  private LocalDateTime regDate;
  private LocalDateTime modDate;
  private String createdBy;
  private String modifiedBy;
}
